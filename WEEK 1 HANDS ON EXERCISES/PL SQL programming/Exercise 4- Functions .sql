SELECT AccountID, Balance,
       HasSufficientBalance(AccountID, 1000) AS CanWithdraw
FROM Accounts;