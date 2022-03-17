package com.leige.design.结构型.享元模式;

import java.awt.*;

/**
 * WhiteChess
 */
public class WhiteChess implements Chess{
    //内部状态，共享
    private final Color color = Color.WHITE;
    @Override
    public void draw(int x, int y) {
        System.out.println(String.format("%s%s棋子置于（%d，%d）处", sharp,"白色", x, y));
    }
}
