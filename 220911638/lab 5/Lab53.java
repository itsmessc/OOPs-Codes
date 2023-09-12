class Time{
    int hh,mm,ss;
    /*int mm;
    int ss;*/
    Time(){
        hh=0;
        mm=0;
        ss=0;
    }
    Time(int h,int m,int s){
        hh=h;
        mm=m;
        ss=s;
    }
    void display()
    {
        System.out.println("Time "+hh+":"+mm+":"+ss);
    }
    void add(Time ob,Time ob1)
    {
        ss=(ob1.ss+ob.ss);
        mm=(ob1.mm+ob.mm);
        hh=(ob1.hh+ob.hh);
        if(ss>=60)
        {
            mm+=ss/60;
            ss%=60;
        }
        if(mm>=60)
        {
            hh+=mm/60;
            mm%=60;
        }
    }
}

public class Lab53 {
    public static void main(String[] args) {
        Time t1=new Time();
        Time t2=new Time(2,30,45);
        Time t3=new Time(2,30,15);
        t2.display();
        t3.display();
        t1.add(t2,t3);
        t1.display();
    }
}
