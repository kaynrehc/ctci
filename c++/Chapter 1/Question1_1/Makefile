CC      = g++
CFLAGS  = -I/home/mchernyak
#LDFLAGS = -lfltk

all: Reverse clean run

Reverse: Reverse.o
	$(CC) -o $@ $^

Reverse.o: Reverse.cpp
	$(CC) -c $(CFLAGS) $<

.PHONY: clean cleanest

clean:
	rm *.o

run:
	./Reverse

cleanest: clean
	rm Reverse

