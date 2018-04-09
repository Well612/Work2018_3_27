public class Student {
    //------------------------狀態------------------------
    private String name,id,dept,tutoTeacher;
    //------------------------建構元------------------------
    public Student(){ }  //可以是空的,示範。
    public Student(String name1,String id1){
        name =name1;
        id=id1;
    //------------------------特性------------------------
    }
    public void setName(String name2){
        name=name2;
    }
    public void setId(String id2){
        id=id2;
    }
    public void setDept(String dept2){
        dept=dept2;
    }
    public void setTutoTeacher(String tutoTeacher2){
        tutoTeacher=tutoTeacher2;
    }
    //------------------------供使用者取得------------------------

    public String getName() { return name; }
    public String getId()  { return id; }
    public String getDept() { return dept; }
    public String getTutoTeacher() { return tutoTeacher; }
    public void showAll(){
        System.out.println("------------------------");
        System.out.println("name:"+this.getName());
        System.out.println("id:"+this.getId());
        System.out.println("dept:"+this.getDept());
        System.out.println("tutoTeacher:"+this.getTutoTeacher());
        System.out.println("------------------------");
    }
}
