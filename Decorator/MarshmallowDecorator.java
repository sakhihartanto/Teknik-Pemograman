/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author User
 */
public class MarshmallowDecorator extends EskrimDecorator {

    public MarshmallowDecorator(Eskrim eskrimSpesial) {
        super(eskrimSpesial);
    }

    @Override
    public String buatEskrim() {
        return eskrimSpesial.buatEskrim() + tambahMarshmallow();
    }

    private String tambahMarshmallow() {
        return " + Mini Marshmallow";
    }
}
