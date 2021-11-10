package practicbox;

public class Test {

    int a, b;

    Test(int i, int j) {
      this.a = i;
       this.b = j;
    }

        boolean equalTo (Test o){
            if (o.a == a && o.b == b) return true;
            else return false;
        }


}
