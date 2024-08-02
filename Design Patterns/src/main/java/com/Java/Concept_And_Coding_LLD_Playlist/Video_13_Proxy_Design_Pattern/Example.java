package com.Java.Concept_And_Coding_LLD_Playlist.Video_13_Proxy_Design_Pattern;

import java.util.Map;

public class Example {
}


interface EmployeeDao {

    public void create(String id , Map.Entry e) ;
    public void delete(String id , int rowNo);
    public void update(String id , int rowNo , Map.Entry e);
}

class EmployeeDaoImplProxy implements EmployeeDao {

    /**
     * Proxy handles all the operations instead of the real implementation
     * it can have
     *
     * 1. Caching
     * 2. Permission Restrictions
     * 3. Some masking
     * 4. Some preprocessing Logging
     * 5. Some postprocessing Logging
     * etc, etc
     * **/
    EmployeeDaoImpl employeeDaoImpl;

    public EmployeeDaoImplProxy() {
        employeeDaoImpl = new EmployeeDaoImpl();
    }


    public void create(String id , Map.Entry e) {

        if(id.equals("Admin")) {
            employeeDaoImpl.create(id , e);
        }
    }

    public void delete(String id , int rowNo) {

        if(id.equals("Admin") && !id.equals("client")) {
            // can have some other conditions as well
            employeeDaoImpl.delete(id , rowNo);
        }
    }
    public void update(String id , int rowNo , Map.Entry e) {

        if(id.equals("User")) {
            employeeDaoImpl.update(id , rowNo , e);
        }
    }

}

class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String id , Map.Entry e) {
        // some db operations
    }

    @Override
    public void delete(String id , int rowNo) {
        // some db operations
    }

    @Override
    public void update(String id , int rowNo , Map.Entry e) {
        // some db operations
    }

}