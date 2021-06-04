page 50100 CalculationCard
{
    PageType = Card;
    ApplicationArea = All;
    UsageCategory = Administration;
    SourceTable = Calculation;
    DelayedInsert = true;
    AutoSplitKey = true;

    layout
    {
        area(Content)
        {
            group(General)
            {
                field(Id; Rec.Id)
                {
                    ApplicationArea = All;

                }
                field(FirstNumber; Rec.FirstNumber)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                }
                field(SecondNumber; Rec.SecondNumber)
                {
                    ApplicationArea = All;
                    ShowMandatory = true;
                }
            }
        }
    }
}