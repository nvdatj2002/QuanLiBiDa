/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tasks;

import SplashScreen.SplashScreen;

public class PrepareWorkSpaceExecutor implements ITaskExcutor {

    @Override
    public void execute(SplashScreen splashScreen) throws Exception {
        splashScreen.setProgressMessage("Đang chuẩn bị bị môi trường làm việc cho bạn...");
        
        //=> Viết các khởi tạo các thông số cho môi trường làm việc (VD: kết nối CSDL, Preferences, Settings)
        //=> TODO: Code for life
    }

}
