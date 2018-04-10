package cn.mapper;

import java.util.List;

import cn.entity.Role;

public interface RoleMapper {

	int insertRole(Role role);

	List<Role> selectRole(String roleName);
}
