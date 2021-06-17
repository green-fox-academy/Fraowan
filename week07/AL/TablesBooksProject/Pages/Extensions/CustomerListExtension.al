pageextension 50101 CustomerListExtension extends "Customer List"
{
    layout
    {
        addafter(Name)
        {
            field(FavouriteBookId; Rec.FavouriteBookId)
            {
                ApplicationArea = All;

            }
        }
    }


}