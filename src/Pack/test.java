package Pack;


public class test {
    public static void main(String[] args) {
        MyJFrame mj = new MyJFrame();
        mj.myJFrame();

        playmusic pm = new playmusic();
        pm.playMusic();

        new Thread(() -> {
            while (true) {
                playMusic();
            }
        }).start();// Lambda表达式
//		new Thread(new Runnable() {
//
//			@Override
//			public void run() {
//				while (true) {
//					playMusic();
//				}
//			}
//		}).start();// 开启一个线程用来播放音乐
    }

    private static void playMusic() {
    }


}