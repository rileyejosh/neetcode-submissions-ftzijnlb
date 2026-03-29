# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        
        # brute force: 
        # to reorder linked-list, use two pointers + list
        nodes = []
        cur = head
        while cur:
            nodes.append(cur)
            cur = cur.next
        i = 1 # left side
        j = len(nodes) - 1 # right side
        cur = head
        while i <= j:
            cur.next = nodes[j]
            cur = cur.next
            cur.next = nodes[i]
            cur = cur.next
            i+=1
            j-=1
        cur.next = None

        