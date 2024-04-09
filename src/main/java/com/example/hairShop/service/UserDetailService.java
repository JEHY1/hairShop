package com.example.hairShop.service;



import com.example.hairShop.domain.User;
import com.example.hairShop.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String username){
        return userRepository.findByEmail(username)
                .orElseThrow(() -> new IllegalArgumentException("not found user"));
    }
}
