package bracechecker;

public class BraceChecker {
    String a = null;
    String b = null;

    Stack st = new Stack();
    //text
         String text;
        //կլասի կոնստրուկորն է, որը պետք է ընդունի String տիպի տեքստ, և վեագրի վերջի տեքստին
        //Որ չկառողանանք  BraceCheaker-ի մետոդ սարկենք առանց  տալու կոնստրուկտորի միջոցով
        public BraceChecker(String text1){
          this.text=text1;
        }
        //սա հիմնական մետոդն է, որի մեջ գրելու ենք հիմական լոգիկան, աշխատելու ենք թե Stack-ի հետ,թե text-ի հետ
        public void chack(){
            int count1 = 0;
            int count2 = 0;
            int count3 = 0;
            int index1 = 0;
            int index2 = 0;
            int index3 = 0;
            for (int i = 0; i < text.length(); i++) {
             char c = text.charAt(i);
                switch (c){
                    case '(':
                        st.push(c);
                        count1++;
                        break;
                    case ')':
                        st.push(c);
                        count1--;
                        index1 = i;
                        break;
                    case '{':
                        st.push(c);
                        count2++;
                        break;
                    case '}':
                        st.push(c);
                        count2--;
                        index2 = i;
                        break;
                    case '[' :
                        st.push(c);
                        count3++;
                        break;
                    case ']':
                        st.push(c);
                        count3--;
                        index3 = i;
                        break;
                }
            }

              if(count1 > 0){
                  a = "(";
              } else if(count1 < 0) {
                  b = ")" + " at " + index1;
              }

            if(count2 > 0){
                a = "{";
            } else if(count2 < 0) {
                b = "}" + " at " + index2;
            }
            if(count3 > 0){
                a = "[";
            } else if(count3 < 0) {
                b = "]" + " at " + index3;
            }
        }
    }
