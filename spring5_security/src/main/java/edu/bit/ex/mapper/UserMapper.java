package edu.bit.ex.mapper;

import org.apache.ibatis.annotations.Insert;

import edu.bit.ex.vo.UserVO;

/**
 * Handles requests for the application home page.
 */
public interface UserMapper {
   
   @Insert("insert into users(username,password,enabled) values(#{username},#{password},#{enabled})")
   public int insertUser(UserVO userVO);
   
   @Insert("insert into AUTHORITIES (username,AUTHORITY) values(#{username},'ROLE_USER')")
   public void insertAuthorities(UserVO UserVO);
}
