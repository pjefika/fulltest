/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.fulltest.operacional.strategy;

/**
 *
 * @author G0042204
 */
public class FactoryExecutionStrategy {

    public static ExecutionStrategy condicional() {
        return new CondicionalStrategy();
    }

    public static ExecutionStrategy forced() {
        return new ForcedStrategy();
    }

}
