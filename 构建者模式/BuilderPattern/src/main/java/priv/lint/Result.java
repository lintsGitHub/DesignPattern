package priv.lint;


import java.util.List;

public class Result<T>{
    private int code;
    private String errmsg;
    private T data;
    private List<Errors> errors;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public List<Errors> getErrors() {
        return errors;
    }

    public void setErrors(List<Errors> errors) {
        this.errors = errors;
    }


}
class ResultServer implements ResultBuilder {
    Result result ;
    @Override
    public ResultBuilder addCode(int id) {
        result.setCode(id);
        return this;
    }

    @Override
    public ResultBuilder addErrmsg(String errmsg) {
        result.setErrmsg(errmsg);
        return this;
    }

    @Override
    public ResultBuilder addData(Object data) {
        result.setData(data);
        return this;
    }

    @Override
    public ResultBuilder adderrs(Errors errors) {
        List list = result.getErrors();
        list.add(errors);
        result.setErrors(list);
        return this;
    }

    @Override
    public ResultBuilder adderrs(List<Errors> errors) {
        result.setErrors(errors);
        return this;
    }

    @Override
    public ResultBuilder adderrs(int errCode, String errMsg) {
        List list = result.getErrors();
        list.add(new Errors(errCode,errMsg));
        result.setErrors(list);
        return this;
    }

    @Override
    public Result end() {
        return this.result;
    }

}
class Errors{
    private int errorCode;
    private String errmsg;

    public Errors() {
    }

    public Errors(int errorCode, String errmsg) {
        this.errorCode = errorCode;
        this.errmsg = errmsg;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }
}
interface ResultBuilder{
    ResultBuilder addCode(int id);
    ResultBuilder addErrmsg(String errmsg);
    ResultBuilder addData(Object data);
    ResultBuilder adderrs(Errors errors);
    ResultBuilder adderrs(List<Errors> errors);
    ResultBuilder adderrs(int errCode , String errMsg);
    Result end();
}