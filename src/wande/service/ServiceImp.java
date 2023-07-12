package wande.service;

import wande.entity.Card;

import java.util.ArrayList;
import java.util.List;

public class ServiceImp implements Service {

    @Override
    public List<Card> getInitCard() {
        List<Card> initCards = new ArrayList<>();
        for (int i = 1; i <= 13; i++) {
            Card card = new Card();
            card.setNumber(i);
            card.setScore(i);
            card.setBigKing(false);
            card.setSmallKing(false);
            for (int j = 1; j <= 4; j++) {
                card.setColor(j);
                initCards.add(card);
            }
        }
        Card bigKing = new Card();
        bigKing.setScore(20);
        bigKing.setBigKing(true);
        bigKing.setSmallKing(false);
        initCards.add(bigKing);

        Card smallKing = new Card();
        smallKing.setScore(20);
        smallKing.setBigKing(false);
        smallKing.setSmallKing(true);
        initCards.add(smallKing);

        return initCards;
    }

    public static void main(String[] args) {
        Service service = new ServiceImp();
        List<Card> cards = service.getInitCard();
        System.out.println(cards);


    }

    @Override
    public List<Card> getTopCard(List<Card> cards) {
        return null;
    }
}
