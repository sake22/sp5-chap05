package spring;

public class MemberSummaryPrinter extends MemberPrinter {

    @Override
    public void print(Member member) {
        System.out.printf("ClientInfo: email=%s, name=%s\n", member.getEmail(), member.getName());
    }
}
