public class question1 {
    public String watermelon(int weight){
        if (weight>100 || weight<1){
            return "no";
        }
        else{
            if((weight%2)==0){
                return "yes";
            }
            else{
                return "no";
            }
        }

    }
}
