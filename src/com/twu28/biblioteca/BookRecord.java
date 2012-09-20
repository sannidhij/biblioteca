package com.twu28.biblioteca;

public class BookRecord {

        int callNo;
        Book book;
        boolean isAvailable;

        BookRecord(int callNo, Book book) {
            this.callNo = callNo;
            this.book = book;
            this.isAvailable = true;
        }

        @Override
        public String toString() {
            return "BookRecord{" +
                    "callNo=" + callNo +
                    ", book=" + book +
                    ", isAvailable=" + isAvailable +
                    '}';
        }
    }

