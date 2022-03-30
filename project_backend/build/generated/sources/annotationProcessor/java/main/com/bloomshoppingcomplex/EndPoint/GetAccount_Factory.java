package com.bloomshoppingcomplex.EndPoint;

import com.bloomshoppingcomplex.DynamoDB.AccountDao;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetAccount_Factory implements Factory<GetAccount> {
  private final Provider<AccountDao> accountDaoProvider;

  public GetAccount_Factory(Provider<AccountDao> accountDaoProvider) {
    this.accountDaoProvider = accountDaoProvider;
  }

  @Override
  public GetAccount get() {
    return new GetAccount(accountDaoProvider.get());
  }

  public static GetAccount_Factory create(Provider<AccountDao> accountDaoProvider) {
    return new GetAccount_Factory(accountDaoProvider);
  }
}