package com.lc.snake;

import javafx.scene.input.KeyCode;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.time.temporal.TemporalUnit;
import java.util.Random;

public class GamePanel extends JPanel implements KeyListener, ActionListener {
    //蛇
    int lenth;
    int[] snakeX = new int[600];
    int[] snakeY = new int[500];
    String fx;
    boolean isStart = false; //游戏是否开始
    int speed=130;
    //时间帧
    Timer timer = new Timer(speed,this); //定时器
    private Object KeyCode;
    //食物坐标
    int foodx;
    int foody;
    Random random=new Random();
    //失败判断
    boolean isFail=false;
    //积分系统
    int score;

    //构造器
    public GamePanel() {
        init();
        //获取键盘监听事件
        this.setFocusable(true);
        this.addKeyListener(this);
        timer.start();  //让时间动起来
    }

    //初始化
    public void init(){
        lenth = 3;
        //蛇身体坐标
        snakeX[0] = 100;snakeY[0] = 100;
        snakeX[1] = 75;snakeY[1] = 100;
        snakeX[2] = 50;snakeY[2] = 100;
        //默认方向
        fx = "R";
        foodx=25+25*random.nextInt(34);
        foody=75+25*random.nextInt(24);
        score = 0;
    }

    //画板，画蛇 Graphics: 画笔
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.setBackground(Color.BLACK); //设置背景颜色
        //绘制头部广告栏
        Data.header.paintIcon(this,g,25,11);
        //绘制游戏区域
        g.fillRect(25,75,850,600);

        //绘制蛇头，蛇头方向
        if(fx.equals("R")){
            Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("L")){
            Data.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("U")){
            Data.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }else if (fx.equals("D")){
            Data.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        //画一条静态小蛇
//        Data.right.paintIcon(this,g,snakeX[0],snakeY[0]);
//        Data.body.paintIcon(this,g,snakeX[1],snakeY[1]);
//        Data.body.paintIcon(this,g,snakeX[2],snakeY[2]);
        for(int i =1;i<lenth;i++){
            Data.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //画食物
        Data.food.paintIcon(this,g,foodx,foody);

        //画积分
        g.setColor(Color.WHITE);  //设置画笔颜色
        g.setFont(new Font("微软雅黑",Font.BOLD,18));  //设置字体
        g.drawString("长度"+lenth,750,30);
        g.drawString("分数"+score,750,50);

        //游戏是否开始
        if(isStart == false){
            g.setColor(Color.WHITE);  //设置画笔颜色
            g.setFont(new Font("微软雅黑",Font.BOLD,40));  //设置字体
            g.drawString("按下空格键开始游戏",280,300);
        }

        //失败
        if(isFail){
            g.setColor(Color.RED);  //设置画笔颜色
            g.setFont(new Font("微软雅黑",Font.BOLD,40));  //设置字体
            g.drawString("游戏失败!,按下空格重新开始",200,300);
        }
    }

    //接收键盘输入:监听
    @Override
    public void keyPressed(KeyEvent e) {
        //获取按下的键盘是哪一个键
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_SPACE){
            if (isFail){
                isFail = false;
                init(); //重新初始化游戏
            }else{  //暂停游戏
                isStart = !isStart; //如果按下的是空格键，启动或者暂停
            }
            repaint(); //刷新界面
        }
        //键盘控制走向
        if (keyCode==KeyEvent.VK_LEFT){
            fx="L";
        }else if(keyCode==KeyEvent.VK_RIGHT){
            fx="R";
        }else if(keyCode==KeyEvent.VK_UP){
            fx="U";
        }else if(keyCode==KeyEvent.VK_DOWN){
            fx="D";
        }
    }

    //执行定时操作
    @Override
    public void actionPerformed(ActionEvent e) {
        //如果游戏处于开始状态,并且游戏没有失败
        if(isStart && isFail==false){
            //右移,除了脑袋，身体都移动
            for (int i=lenth-1;i>0;i--){
                snakeX[i]=snakeX[i-1];
                snakeY[i]=snakeY[i-1];
            }
            //通过控制方向让头部移动
            if (fx.equals("R")){
                snakeX[0] = snakeX[0]+25;
                if (snakeX[0]>850){snakeX[0]=25;}
            }else if(fx.equals("L")){
                snakeX[0] = snakeX[0]-25;
                if (snakeX[0]<25){snakeX[0]=850;}
            }else if (fx.equals("U")){
                snakeY[0] = snakeY[0]-25;
                if (snakeY[0]<75){snakeY[0]=650;}
            }else if (fx.equals("D")){
                snakeY[0] = snakeY[0]+25;
                if (snakeY[0]>650){snakeY[0]=75;}
            }

            //如果小蛇的头与食物重合
            if (snakeX[0]==foodx && snakeY[0]==foody){
                lenth++;
                score =score+10;
                //重新生成食物
                foodx=25+25*random.nextInt(34);
                foody=75+25*random.nextInt(24);
            }
//            snakeX[0] = snakeX[0]+25;
//            //边界判断
//            if (snakeX[0]>850){
//                snakeX[0] = 25;
//            }
            //结束判断
            for (int i=1;i<lenth;i++){
                if (snakeX[0]==snakeX[i] && snakeY[0]==snakeY[i]){
                    isFail= true;
                }
            }
            //每次移动完成，刷新界面
            repaint();
        }
        timer.start(); //时间动起来
    }

    @Override
    public void keyReleased(KeyEvent e) { }
    @Override
    public void keyTyped(KeyEvent e) { }
}
