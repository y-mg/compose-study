package com.ymg.compose.movieapp.ui.components.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.ymg.compose.movieapp.R
import com.ymg.compose.movieapp.ui.models.buttons.LeadingIconData
import com.ymg.compose.movieapp.ui.models.dialog.DialogButton
import com.ymg.compose.movieapp.ui.theme.MovieAppTheme


@Preview
@Composable
fun AlertPreview() {
    MovieAppTheme {
        DialogPopup.Alert(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButton.UnderlinedText("Okay") {}
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieAppTheme {
        DialogPopup.Default(
            title = "Title",
            bodyText = "blah balh blah",
            buttons = listOf(
                DialogButton.Primary("OPEN") {},
                DialogButton.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieAppTheme {
        DialogPopup.Rating(
            movieName = "The Lord of the Rings: The Two Towers",
            rating = 7.5f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "OPEN",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ) {},
                DialogButton.SecondaryBorderless("CANCEL") {}
            )
        )
    }
}
