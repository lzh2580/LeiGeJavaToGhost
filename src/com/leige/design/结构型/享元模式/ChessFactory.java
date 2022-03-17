package com.leige.design.结构型.享元模式;


import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * ChessFactory
 */
public class ChessFactory {
    public static Map<Color, Chess> map = new HashMap<>(2);
    public static Chess getChess(Color color){
        Chess c = map.get(color);
        if(c == null){
            c = color == Color.WHITE ? new WhiteChess() : new BlackChess();
            map.put(color,c);
        }
        return c;
    }
}
