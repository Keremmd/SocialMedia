import Controller.Sign.HomeSignController;
import Controller.UserInterface.HomeUserController;

public class Main {
    public static void main(String[] args) {
        HomeSignController controller = new HomeSignController();
        controller.run();
        while (!controller.IsLogged()) {
            try {
                Thread.sleep(1000); // 2 saniye bekle
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        controller.SetVisible(false);
        HomeUserController userController = new HomeUserController();
        userController.run();

    }
}

//TODO grup,grup oluşturma, arama eklenecek ve arkadaş eklemedeki logic hatası düzeltilecek.
// grupları yine grup ismi:katılımcı-katılımcı2-.... gibi düzenleyip kimin hesabıyla
// giriş yapılmışsa o hesabın idsninin içerdiği grup isimleri orada listelenecek.


// TODO arama