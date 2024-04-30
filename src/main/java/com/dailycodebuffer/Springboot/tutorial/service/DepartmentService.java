package com.dailycodebuffer.Springboot.tutorial.service;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService {
  public Department saveDepartment(Department department);

  public List<Department> fetchDepartmentList();

  public Department findDepartmentById(Long departmentId);

  public void deleteDepartmentById(Long departmentId);

  public Department updateDepartment(Long departmentId, Department department);

  public Department findDepartmentByName(String departmentName);
}
