An actual interview question that I have removed company information from.

/*
Every email consists of a local name and a domain name, separated by the @ sign.
 
For example, in tommy@email.com, tommy is the local name, and email.com is the domain name.

Besides lowercase letters, these emails may contain '.'s or '+'s.

If you add periods ('.') between some characters in the local name part of an email address, mail sent there will be forwarded to the same address without dots in the local name.  For example, "tommy.h@email.com" and "tommyh@email.com" forward to the same email address.  (Note that this rule does not apply for domain names.)

If you add a plus ('+') in the local name, everything after the first plus sign will be ignored. This allows certain emails to be filtered, for example m.y+name@email.com will be forwarded to my@email.com.  (Again, this rule does not apply for domain names.)

It is possible to use both of these rules at the same time.

Given a list of emails, we send one email to each address in the list.  How many different addresses actually receive mails?


Note:

1 <= emails[i].length <= 100
1 <= emails.length <= 100
Each emails[i] contains exactly one '@' character.
All local and domain names are non-empty.
Local names do not start with a '+' character.

Example:
Input: ["test.email+alex@email.com","test.e.mail+bob.cathy@email.com","testemail+david@e.mail.com"]
Output: 2

Test Cases:
["test.email+alex@alphaomega.com","test.e.mail+bob.cathy@alphaomega.com","testemail+david@alpha.omega.com","testemail+davidnatera@alphaomega.com","teste+mail.davidnatera@alphaomega.com","teste.mail.davidnatera@alphaomega.com","test.email@davidalpha+omega.com","test+email@davidalpha.omega.com","test+email@david.alpha.omega.com","test+email+david@alpha+omega.com","test+email.david@alpha+omega.com",".t.est.email+@david.alpha.omega.com",".t.est.emai+l+@.david.alpha.omega.com","+test.email@david.alpha.omega.com"]
*/