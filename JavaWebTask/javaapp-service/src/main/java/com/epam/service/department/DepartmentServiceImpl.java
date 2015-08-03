package com.epam.service.department;

import com.epam.dao.department.DepartmentDao;
import com.epam.model.Department;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Roman
 */

@Service("departmentService")
@Transactional
public class DepartmentServiceImpl implements DepartmentService {

    static final Logger log = Logger.getLogger(DepartmentServiceImpl.class);

    @Autowired
    private DepartmentDao departmentDao;

    @Override
    public void addDepartment(Department department) {
        log.debug("Add department in department table");
        departmentDao.addDepartment(department);
    }

    @Override
    public void updateDepartment(Department department) {
        log.debug("Update department in department table");
        departmentDao.updateDepartment(department);
    }

    @Override
    public List<Department> getDepartmentByName(String name) {
        log.debug("Get department from department table");
        return departmentDao.getDepartmentByName(name);
    }

    @Override
    public void deleteDepartment(int id) {
        log.debug("Delete department in department table");
        departmentDao.deleteDepartment(id);
    }

    @Override
    public List<Department> getDepartments() {
        return departmentDao.getDepartments();
    }
}