package designPattern.src.pattern.bridege.noPattern.domain;

/**
 * description:
 *
 * @date 2021/4/20 14:15
 */
public class CircleShapeWithDraw1 implements Shape {
    private double x, y, radius;

    @Override
    public void draw(){
        System.out.println("用水彩笔画");
    }

}
