#include <stdio.h>
#include<stdlib.h>
struct node
{
 int data;
 struct node *next;
};

int main()
{
 struct node *head;
 struct node *one=NULL;
 struct node *two=NULL;
 struct node *three=NULL;

//allocating memory
 one=malloc(sizeof(struct node));
 two=malloc(sizeof(struct node));
 three=malloc(sizeof(struct node));
 
 //initialising data
 one->data=1;
 two->data=2;
 three->data=3;

//linking elements
 one->next=two;
 two->next=three;
 three->next=NULL;

 head=one;

//adding at start
 struct node *start;
 start=malloc(sizeof(struct node));
 start->data=0;
 start->next=one;
 head=start;

//adding at last
 struct node *end;
 end=malloc(sizeof(struct node));
 three->next=end;
 end->data=4;
 end->next=NULL;
 head=start;

 //printing elements
 while(head!=NULL)
 {
  printf("%d\n",head->data);
  head=head->next;
 }
    return 0;
}
