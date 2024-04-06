package ma.emsi.userrole.service;

import ma.emsi.userrole.entities.Role;
import ma.emsi.userrole.entities.User;

public interface UserService {
    User addNewUser(User user);
    Role addNewRole(Role role);
    User findUserByUserName(String name);
    Role findRoleByRoleName(String name);
    void addRoletoUser(String username,String rolename);
}
