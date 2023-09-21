package Week5;

import java.util.Date;

public class Person {
    private String name;
    private Date born;
    private  Date died;
    //died 가 null이라면 살아있는 것
    // born은 반드시 died 보다 빨라야한다.

    public Person(String _name, Date _born, Date _died){
        if(!consistent(_born, _died)){
            System.out.println("Inconsistent dates");
            System.exit(1);
        }
        else{
            this.name = _name;
            this.born = new Date(_born.getYear(), _born.getMonth(), _born.getDate());
            if(_died != null)
                this.died = new Date(_died.getYear(), _died.getMonth(), _died.getDate());
            else
                this.died = null;
        }
    }

    private static boolean consistent(Date born, Date died) {
        if (born == null)
            return false;
        else if (died == null)
            return true;
        else
            return (born.compareTo(died) <= 0);
    }

    public String toString(){
        String result = "Name : " + this.name + ", Born in " + born.getMonth() + "/" + born.getDate() + "/" + born.getYear();
        if(this.died != null)
            result += ", died in " + died.getMonth() + "/" + died.getDate() + "/" + died.getYear();
        return result;
        }

    boolean equals(Person other){
        if(other == null)
            return false;
        else
            return (this.name.equals(other.name)&& this.born.equals(other.born) && dateMatch(this.died, other.died));
    }

    private static boolean dateMatch(Date date1, Date date2){
        if(date1 == null)
            return (date2 == null);
        else if(date2 == null)
            return false;
        else
            return(date1.equals(date2));
    }

    public String getName(){
        return this.name;
    }

    public Date getborn(){
        return new Date(born.getYear(), born.getMonth(), born.getDate());
    }

    public Date getDied(){
        if(died == null)
            return null;
        else
            return new Date(died.getYear(), died.getMonth(), died.getDate());
    }

    public void setName(String _name){
        this.name = _name;
    }

    public void setBorn(Date _born){
        if(_born == null){
            System.out.println("Invalid date");
            return;
        }
        this.born = new Date(_born.getYear(), _born.getMonth(), _born.getDate());
    }

    public void setDied(Date _died){
        if(_died == null)
            this.died = null;
        else
            this.died = new Date(_died.getYear(), _died.getMonth(), _died.getDate());
    }




    }
