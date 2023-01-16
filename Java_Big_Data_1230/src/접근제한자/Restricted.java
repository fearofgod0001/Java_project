package 접근제한자;
// 접근제한자는 객체지향언어의 4가지 종요 특성중에 하나 입니다.
// 사용 목적은 내부의 필드값을 외부에 접근하는 것을 제한하는 목적으로 사용합니다.

public class Restricted {
    public static void main(String[] args) {
        ChildRest childRest = new ChildRest();
        childRest.getMoney();
        System.out.println(childRest.name);
        System.out.println(childRest.jobs); // 동일 패키지 public


    }
}



class ChildRest extends ParentRest {
    String jobs;
    public String getJobs(){
        return jobs;
    }
    public void setJobs(String jobs){
        this.jobs = jobs;
    }
    public String getMoney(){
        return money;
    }
    public String getName(){
        return name;
    }
    public String getAddr(){
        return addr;
    }
}