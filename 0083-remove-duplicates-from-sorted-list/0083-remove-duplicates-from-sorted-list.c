/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* deleteDuplicates(struct ListNode* head) {
    if (head == NULL) return NULL;
    
    struct ListNode* tmp = head;
    
    while (tmp != NULL && tmp->next != NULL) {
        if (tmp->val == tmp->next->val) {
            tmp->next = tmp->next->next;  
        } else {
            tmp = tmp->next; 
        }
    }
    
    return head;
}