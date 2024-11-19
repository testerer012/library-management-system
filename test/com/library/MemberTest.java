package com.library;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MemberTest {

    @Test
    public void testGetSetName() {
        Member member = new Member();
        member.setName("John Doe");
        assertEquals("John Doe", member.getName());
    }

    @Test
    public void testGetSetAddress() {
        Member member = new Member();
        member.setAddress("123 Main St");
        assertEquals("123 Main St", member.getAddress());
    }

    @Test
    public void testGetSetMembershipStatus() {
        Member member = new Member();
        member.setMembershipStatus(true);
        assertTrue(member.isMembershipStatus());
    }
}