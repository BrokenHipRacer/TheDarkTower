package com.InterviewCode.TheDarkTower.emailLists.services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

@Service
public class EmailListsService {

    EmailListsService emailListsService() {
        return null;
    }

    // First the code that I was writing in the quick timed interview that was a brute implementation
    // Second I have had to edit the code to work so has it's slightly changed from
    public List<String> emails = new ArrayList<>();

    public String simpString(String email) {
        String local = email.split(Pattern.quote("@"))[0];
        String first = local.split(Pattern.quote("+"))[0];
        String cleanDot = first.replace(".", "");
        return cleanDot + "@" + email.split(Pattern.quote("@"))[1];
    }

    public List<String> distList(List<String> givenEmails) {
        givenEmails.stream().forEach(email -> {
            String easy = simpString(email);
            if (!emailInCurrent(easy)) {
                emails.add(easy);
            }
        });
        return emails;
    }

    public Boolean emailInCurrent(String sample) {
        for (String email : emails) {
            if (email.equals(sample)) {
                return true;
            }
        }
        return false;
    }

    public void purgeEmailList() {
        emails = new ArrayList<>();
    }

    // ^ So that isn't wasn't very efficient....

    public Set<String> setDistList(List<String> givenList) {
        Set<String> cleanedList = new HashSet<>();
        for(String email: givenList) {
            cleanedList.add(simpString(email));
        }
        return cleanedList;
    }

}
