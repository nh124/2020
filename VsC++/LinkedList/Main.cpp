#include <iostream>

struct Node{
    int data;
    struct Node* next;
};
class linkedList{
    Node *head;
    Node *tail;
    public:
        linkedList(){
            head = NULL;
            tail = NULL;
        }
        void add(int data){
            Node *newNode = new Node();
            newNode->data = data;
            newNode->next = NULL;
            if(this->head == NULL){
                this->head = newNode;
                this->tail = newNode;
            }else{
                tail->next = newNode;
                this->tail = tail->next;
            }
        }

        
    
    public:
        void remove(int position){
            Node *newNode = head;
            if(this->head == NULL){
                return;
            }
            if(position = 0){
                newNode = newNode->next; 
            }
            for(int i = 0; i < position-1 && newNode != NULL; i++){
                newNode = newNode->next;
                if(newNode == NULL || newNode->next == NULL){
                    return;
                }
            }
            Node *next = newNode->next->next;
            newNode->next = next;
        };


    public:
        void print(){
            Node *currNode = this->head;
            while(currNode != NULL){
                std::cout << currNode->data << " ";
                currNode = currNode->next;
            }
            std::cout << "\n";
        }        


};



int main(){
    linkedList *ll = new linkedList();
    ll->add(1);
    ll->add(2);
    ll->add(3);
    ll->add(4);
    ll->add(5);
    ll->add(6);
    ll->add(7);
    ll->add(8);

    ll->print();

    ll->remove(3);

    ll->print();

}