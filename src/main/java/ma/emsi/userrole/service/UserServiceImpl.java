package ma.emsi.userrole.service;

import ma.emsi.userrole.entities.Role;
import ma.emsi.userrole.entities.User;
import ma.emsi.userrole.repositories.RoleRepository;
import ma.emsi.userrole.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    RoleRepository roleRepository;
    UserRepository userRepository;

    public UserServiceImpl(RoleRepository roleRepository, UserRepository userRepository) {
        this.roleRepository = roleRepository;
        this.userRepository = userRepository;
    }

    @Override
    public User addNewUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public Role addNewRole(Role role) {
        return roleRepository.save(role);
    }

    @Override
    public User findUserByUserName(String name) {
        return userRepository.findByNom(name);
    }

    @Override
    public Role findRoleByRoleName(String name) {
        return roleRepository.findByNom(name);
    }

    @Override
    public void addRoletoUser(String username, String rolename) {
        Role role=findRoleByRoleName(rolename);
        User user=findUserByUserName(username);
        if(user.getRoles()!=null){
            user.getRoles().add(role);
            role.getUsers().add(user);
        }
    }
}
