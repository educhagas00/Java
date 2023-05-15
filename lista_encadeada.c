#include<stdio.h>
#include<stdlib.h>


typedef struct lista{

    int info;
    struct lista* prox;

}Lista;

Lista* lista_cria();
Lista* lista_insere(Lista* lst, int val);
Lista* lista_remove(Lista* lst, int val);
void lst_imprime(Lista* lst);
Lista* lst_busca(Lista* lst, int val);

int main()
{
    Lista* lst;
    lst = lista_cria();

    lst = lista_insere(lst, 12);
    lst = lista_insere(lst, 21);
    lst = lista_insere(lst, 4);

    //lst = lista_remove(lst, 21);

    lst_busca(lst, 21);
    lst_imprime(lst);

    return 0;
}

Lista* lista_cria()
{
    return NULL;
}

Lista* lista_insere(Lista* lst, int val)
{
    Lista* novo = (Lista*) malloc(sizeof(Lista));
    novo->info = val;
    novo->prox = lst;
    return novo;
}

Lista* lista_remove(Lista* lst, int val)
{
    Lista* ant = NULL;
    Lista* p = lst;

    while(p != NULL && p->info != val)
    {
        ant = p;
        p = p->prox;
    }

    if(p == NULL)
    {
        return lst; //n achou
    }

    if(ant == NULL)
    {
        lst = p->prox;
    }
    else
    {
        ant->prox = p->prox;
    }
    free(p);
    return lst;
}


void lst_imprime(Lista* lst)
{
    Lista* p;
    for(p = lst; p != NULL; p = p->prox)
    {
        printf("info = %d\n", p->info);
    }
}

Lista* lst_busca(Lista* lst, int val)
{
    Lista* p;
    for(p = lst; p != NULL; p = p->prox)
    {
        if(p->info == val)
        {
            printf("elemento %d encontrado\n", val);
            return p;
        }
    }
    printf("elemento %d nao encontrado\n", val);
    return NULL;
}