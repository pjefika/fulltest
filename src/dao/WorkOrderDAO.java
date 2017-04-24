/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.WorkOrderReporting.WorkOrderReportingProxy;
import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.FindWorkOrderIn;
import br.com.gvt.www.ResourceManagement.WorkforceManagement.WorkforceManagementReporting.workOrderReportingEntities.WorkOrder;
import java.rmi.RemoteException;

/**
 *
 * @author G0042204
 */
public class WorkOrderDAO {

    private WorkOrderReportingProxy service = new WorkOrderReportingProxy();

    public WorkOrder[] getWorkOrder(String workOrderId) throws RemoteException {
        return service.findWorkOrder(new FindWorkOrderIn(workOrderId, null, null, null));
    }

}
