package Java_Language.Strings;
public class SbExclusiveMethods {
    public static void main(String[] args) {
        // 1) append(x)
        StringBuilder sb = new StringBuilder("ABCD");
        sb.append('E');
        sb = sb.append(2<9);
        sb = sb.append(" &");
        System.out.println(sb);

        // 2) insert(offset,x)
        sb = sb.insert(5,"F"); // or sb.insert(5,"F");
        System.out.println(sb);

        // 3) setCharAt(index,c)
        sb.setCharAt(11,'!');
        System.out.println(sb);

        // 4) reverse()
        sb = sb.reverse();// or sb.reverse();
        System.out.println(sb);

        // 5) deleteCharAt(index)
        sb.reverse();
        sb = sb.deleteCharAt(10); // or sb.deleteCharAt(10);
        System.out.println(sb);

        // 6) delete(start,end)
        sb.delete(2,6);// or sb = sb.delete(2,6);
        System.out.println(sb);

        // 7) capacity()
        int cap = sb.capacity();
        System.out.println(cap);

        // 8) replace(start,end,str)
        sb = sb.replace(2,6,"CDEF");
        System.out.println(sb);
        sb = sb.replace(2,6,"CDEFGHI");
        System.out.println(sb);

        sb.insert(4,"yes its possible");
        System.out.println(sb);
    }
}
