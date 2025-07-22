public class FactoryUi {

    public static Ui factoryMehtod(String password){

        if (password.length()==3){
            return new TeacherUi();
        }else if (password.length() >3){
            return new StudentUi();
        }else {
            return null;
        }
    }
}
