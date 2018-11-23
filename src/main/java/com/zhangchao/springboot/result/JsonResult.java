package com.zhangchao.springboot.result;

/**
 * 〈〉
 *
 * @author 22902
 * @create 2018/11/15
 */
public class JsonResult {

    private String code;

    private String message;

    private Boolean status;

    private Object data;

    public JsonResult() {
    }

    public JsonResult(Object data) {
        this.data = data;
    }

    public JsonResult(String code, String message, Boolean status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }

    public JsonResult(String code, String message, Boolean status, Object data) {
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getstatus() {
        return status;
    }

    public void setstatus(Boolean status) {
        this.status = status;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonResult success(String code, String message, Boolean status, Object data){
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
        return this;
    }
    public JsonResult success(String code, String message, Boolean status){
        this.code = code;
        this.message = message;
        this.status = status;
        return this;
    }
    public JsonResult success(String message, Boolean status,Object data){
        this.message = message;
        this.status = status;
        this.data = data;
        return this;
    }
    public JsonResult success(String message){
        this.message = message;
        return this;
    }
    public JsonResult failure(String code, String message, Boolean status, Object data){
        this.code = code;
        this.message = message;
        this.status = status;
        this.data = data;
        return this;
    }
    public JsonResult failure(String code, String message, Boolean status){
        this.code = code;
        this.message = message;
        this.status = status;
        return this;
    }
    public JsonResult failure(String message, Boolean status, Object data){
        this.message = message;
        this.status = status;
        this.data = data;
        return this;
    }
    public JsonResult failure(String message, Boolean status){
        this.message = message;
        this.status = status;
        return this;
    }
  public JsonResult failure(String message){
        this.message = message;
        return this;
    }

}
