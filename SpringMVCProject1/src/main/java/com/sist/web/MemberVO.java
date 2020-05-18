package com.sist.web;

import lombok.Getter;
import lombok.Setter;
// ? name=ȣ�浿&  ==> setname(name)
@Getter
@Setter
public class MemberVO {
  private String name;
  private String sex;
  private String address;
  private String tel;
  private String content;
}
