#include <string.h>

int countMatches(char*** items, int itemsSize, int* itemsColSize, char* ruleKey, char* ruleValue) {
    int val = 0;
    int col = 0;
    if (strcmp(ruleKey, "type") == 0) col = 0;
    else if (strcmp(ruleKey, "color") == 0) col = 1;
    else if (strcmp(ruleKey, "name") == 0) col = 2;

    for (int i = 0; i < itemsSize; i++) {
        if (strcmp(items[i][col], ruleValue) == 0) {
            val++;
        }
    }

    return val;
}
