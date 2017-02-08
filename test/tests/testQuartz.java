/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import job.FullTestMassivo;
import static org.quartz.JobBuilder.*;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import static org.quartz.SimpleScheduleBuilder.*;
import org.quartz.SimpleTrigger;
import static org.quartz.TriggerBuilder.*;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author G0041775
 */
public class testQuartz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            // define the job and tie it to our MyJob class
            JobDetail job = newJob(FullTestMassivo.class)
                    .withIdentity("job1", "group1")
                    .build();
            
            // Trigger the job to run now, and then repeat every 40 seconds
            SimpleTrigger trigger = newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule()
                            .withIntervalInSeconds(5)
                            .repeatForever())
                    .build();
            
            // Tell quartz to schedule the job using our trigger
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
            scheduler.scheduleJob(job, trigger);
            
            scheduler.start();
            
        } catch (SchedulerException ex) {
            ex.printStackTrace();
        }

    }

}
