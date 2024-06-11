package ru.job4j.bank;

import java.util.*;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (!Objects.isNull(user)) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        User searchUser = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                searchUser = user;
                break;
            }
        }
        return searchUser;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        Account searchAccount = null;
        if (user != null) {
            for (Account account : users.get(user)) {
                if (account.getRequisite().equals(requisite)) {
                    searchAccount = account;
                    break;
                }
            }
        }
        return searchAccount;
    }

    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        boolean result = false;
        Account accountSrc = findByRequisite(sourcePassport, sourceRequisite);
        Account accountTrg = findByRequisite(destinationPassport, destinationRequisite);
        if (accountSrc != null && accountSrc.getBalance() >= amount && accountTrg != null) {
            accountSrc.setBalance(accountSrc.getBalance() - amount);
            accountTrg.setBalance(accountTrg.getBalance() + amount);
            result = true;
        }
        return result;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}