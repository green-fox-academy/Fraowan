pageextension 50100 CustomerCardExtension extends "Customer Card"
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