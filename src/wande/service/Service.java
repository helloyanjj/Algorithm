package wande.service;

import wande.entity.Card;

import java.util.List;

public interface Service {
    List<Card> getTopCard(List<Card> cards);

    List<Card> getInitCard();
}
