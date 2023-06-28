package Encapsulation;

public class AccessModifierClass {

    private String privateString = "private";
    String defaultString = "default";
    protected String protectedString = "protected";
    public String publicString = "public";

    public static void main(String[] args) {
        AccessModifierClass accessModifierClass = new AccessModifierClass();
        System.out.println(accessModifierClass.privateString);
        System.out.println(accessModifierClass.defaultString);
        System.out.println(accessModifierClass.protectedString);
        System.out.println(accessModifierClass.publicString);
    }
}
