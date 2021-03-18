package vn.edu.nlu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.nlu.repository.UserRepository;

@Service
public class CustomUserDetailsService { //implements UserDetailsService

    @Autowired
    private UserRepository userRepository;

//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        UserEntity userEntity = userRepository.findOneByUsernameAndStatus(username, SystemConstant.ACTIVE_STATUS);
//
//        if (userEntity == null) {
//            throw new UsernameNotFoundException("User not found");
//        }
//
//        List<GrantedAuthority> authorities = new ArrayList<>();
//        for (RoleEntity role : userEntity.getRoles()) {
//            authorities.add(new SimpleGrantedAuthority(role.getCode()));
//        }
////        put info voo security
//        MyUser myUser = new MyUser(userEntity.getUsername(), userEntity.getPassword(),
//                true, true, true, true, authorities);
//        myUser.setFullname(userEntity.getFullname());
//        return myUser;
//    }
}
