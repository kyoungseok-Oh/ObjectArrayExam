public class ObjectArrayExam {
    public static void main(String[] args) {
        //Q. 영화 3편을 저장 할 배열을 생성하고 영화 3편의 데이터를 저장하고 출력하세요
        Movie[] m=new Movie[3];
        m[0]=new Movie();
        m[0].title="아바타";
        m[0].openday ="2022.12.14";
        m[0].name="제이크 설리";
        m[0].kind="액션";
        m[0].runningtime=192;
        m[0].age="12세";
        //System.out.println(m[0].title+"\t"+m[0].openday+"\t"+m[0].name+"\t"+m[0].kind+"\t"+m[0].runningtime+"\t"+m[0].age+"\t");
        m[1]=new Movie();
        m[1].title="범죄도시";
        m[1].openday ="2023.06.14";
        m[1].name="마동석";
        m[1].kind="액션";
        m[1].runningtime=120;
        m[1].age="15세";
        //System.out.println(m[1].title+"\t"+m[1].openday+"\t"+m[1].name+"\t"+m[1].kind+"\t"+m[1].runningtime+"\t"+m[1].age+"\t");
        m[2]=new Movie();
        m[2].title="신과함께";
        m[2].openday ="2020.01.14";
        m[2].name="차태현";
        m[2].kind="판타지";
        m[2].runningtime=122;
        m[2].age="12세";
        for (int i = 0; i <m.length; i++) {
            System.out.println(m[i].title+"\t"+m[i].openday+"\t"+m[i].name+"\t"+m[i].kind+"\t"+m[i].runningtime+"\t"+m[i].age+"\t");
        }




    }
}
