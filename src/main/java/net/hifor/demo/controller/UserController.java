package net.hifor.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author IKin <br/>
 * @description <br/>
 * @create 2024/5/8 09:16 <br/>
 */
@RequestMapping("/user")
@RestController
public class UserController {
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Result<User> getHandle(@PathVariable long id) {
        // 省略参数验证...
        System.out.println("id :: " + id);
        User user = new User();
        user.setId(id);
        user.setName("张三");
        user.setAge(20);
        user.setSex((byte) 1);
        Result result = new Result<User>();
        result.setObj(user);
        return result;
    }

    @PostMapping("/")
    public Result postHandle(@RequestBody User user) {
        // 省略参数验证...
        System.out.println(user.toString());
        Result result = new Result();
        return result;
    }

    @PutMapping("/")
    public Result putHandle(@RequestBody User user) {
        // 省略参数验证...
        System.out.println(user.toString());
        Result result = new Result();
        return result;
    }

    @PatchMapping("/")
    public Result patchHandle(@RequestBody User user) {
        // 省略参数验证...
        System.out.println(user.toString());
        Result result = new Result();
        return result;
    }

    @DeleteMapping("/{id}")
    public Result deleteHandle(@PathVariable int id) {
        // 省略参数验证...
        System.out.println("id :: " + id);
        Result result = new Result();
        return result;
    }
}

class User {
    Long id;
    String name;
    byte sex;
    int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getSex() {
        return sex;
    }

    public void setSex(byte sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }
}

class Result<T> {
    Integer code = 0;
    String msg = "ok";
    T obj;
    List<T> list;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }

    public List<T> getList() {
        return list;
    }

    public void setList(List<T> list) {
        this.list = list;
    }
}
